import { Component, OnInit } from '@angular/core';
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

  constructor(private customerService: CustomerService) { }

  addCustomer() {
    console.log(this.customer)
    this.customerService.addCustomer(this.customer).subscribe((res) => {
      console.log(res);
    })
  }

  ngOnInit(): void {
  }

}
