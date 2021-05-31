import { Component, Input, OnInit } from '@angular/core';
import { AbstractControl } from '@angular/forms';
import { Router } from '@angular/router';
import { CustomerService } from 'src/app/service/customer.service';
import { CustomerComponent } from '../customer.component';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.scss']
})
export class CustomerCreateComponent implements OnInit {

  customers_all: any = [];
  customersId: any = [];

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

  getAllCustomers() {
    this.customerService.getCustomers().subscribe((customers: any) => {
      this.customers_all = customers;
      for (let i in customers) {
        this.customersId.push(customers[i].id)
      }
    })
  }

  duplicateValidator(id: string) {
    return this.customersId.includes(id) ? true : false;
  }

  ngOnInit(): void {
    this.getAllCustomers();
  }

  ngDoCheck(): void {
    this.duplicateValidator(this.customer.id);
  }

}
