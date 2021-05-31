import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerService } from 'src/app/service/customer.service';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.scss']
})
export class CustomerCreateComponent implements OnInit {

  customer: any = {
    "id": "",
    "username": "",
    "email": "",
    "phoneNumber": "",
    "postCode": ""
  }

  constructor(private customerService: CustomerService, private router: Router) { }

  addCustomer() {
    this.customerService.addCustomer(this.customer).subscribe((res) => {
      this.router.navigate(['customer']);
      setTimeout(() => {
        alert("ID：" + res.id + "のCustomerを作成しました！")
      }, 100)
    })
  }

  ngOnInit(): void {
  }

}
