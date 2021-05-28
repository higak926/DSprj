import { Component, OnInit } from '@angular/core';
import { Subject } from 'rxjs';
import { CustomerService } from '../service/customer.service';
import { takeUntil } from 'rxjs/operators'

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.sass']
})
export class CustomerComponent implements OnInit {

  public serviceProp: String = '';
  customers: any = [];

  destroy$: Subject<boolean> = new Subject<boolean>();

  constructor(private customerService: CustomerService) { }

  getAllCustomers() {
    this.customerService.getCustomers().subscribe((customers: any) => {
      console.log(customers);
      this.customers = customers;
      console.log(this.customers);
    })
  }

  ngOnInit(): void {
    this.serviceProp = this.customerService.customerProp;
    this.getAllCustomers();
  }

}
