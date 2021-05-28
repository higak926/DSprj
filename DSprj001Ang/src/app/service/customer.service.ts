import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  public customerProp: String = '';

  constructor(private http: HttpClient) {
    this.customerProp = 'OK！';
  }

  rootURL = '/api/customers';

  public getCustomers(): Observable<any> {
    console.log(this.http)
    return this.http.get(this.rootURL);
  }

  public addCustomer(customer: any): Observable<any> {
    return this.http.post(this.rootURL, customer);
  }

}
