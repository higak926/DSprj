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
    return this.http.get(this.rootURL);
  }

  public getCustomer(id: string): Observable<any> {
    return this.http.get(this.rootURL + "/" + id, {responseType: 'json'});
  }

  public addCustomer(customer: any): Observable<any> {
    return this.http.post(this.rootURL, customer);
  }

  public updateCustomer(customer: any): Observable<any> {
    return this.http.patch(this.rootURL, customer);
  }

  public deleteCustomer(id: string): Observable<any> {
    return this.http.delete(this.rootURL + "/" + id, {responseType: 'text'});
  }

}
