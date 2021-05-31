import { Component, OnInit } from '@angular/core';
import { Subject } from 'rxjs';
import { CustomerService } from '../service/customer.service';
import { takeUntil } from 'rxjs/operators'
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.scss']
})
export class CustomerComponent implements OnInit {

  public serviceProp: String = '';
  customers: any = [];

  destroy$: Subject<boolean> = new Subject<boolean>();

  constructor(private customerService: CustomerService, private router: Router) { }

  getAllCustomers() {
    this.customerService.getCustomers().subscribe((customers: any) => {
      this.customers = customers;
    })
  }

  deleteCustomer(id: string) {
    this.customerService.deleteCustomer(id).subscribe((res: any) => {
      this.getAllCustomers();
      setTimeout(() => {
        alert("ID：" + res + "のCustomerを削除しました！")
      }, 100)
    })
  }

  ngOnInit(): void {
    this.serviceProp = this.customerService.customerProp;
    this.getAllCustomers();
  }

}
