import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerService } from '../service/customer.service';

@Component({
  selector: 'app-customer-detail',
  templateUrl: './customer-detail.component.html',
  styleUrls: ['./customer-detail.component.scss']
})
export class CustomerDetailComponent implements OnInit {

  id: string = '';

  customer: any = {
    "id": "",
    "username": "",
    "email": "",
    "phoneNumber": "",
    "postCode": ""
  }

  constructor(private customerService: CustomerService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.route.url.subscribe(url => {
      this.id = url[1].path;
    });
    this.getCustomer();
  }

  getCustomer() {
    this.customerService.getCustomer(this.id).subscribe(customer => {
      this.customer = customer;
    });
  }

  updateCustomer() {
    this.customerService.updateCustomer(this.customer).subscribe(res => {
      this.router.navigate(['customer']);
      setTimeout(() => {
        alert("ID：" + res.id + "の登録内容を更新しました！")
      }, 100)
    });
  }

}
