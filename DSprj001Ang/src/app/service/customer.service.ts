import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  public customerProp: String = '';

  constructor(private http: HttpClient) {
    this.customerProp = 'OK！';
  }

  rootURL = '/api';

  getCustomers() {
    return this.http.get(this.rootURL + '/customers');
  }

  addCustomer(customer: any, id: number) {
    customer.id = id;
    return this.http.post(this.rootURL + '/customers', customer);
  }

}
