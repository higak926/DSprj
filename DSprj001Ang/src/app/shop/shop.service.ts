import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { guid, ID } from '@datorama/akita';
import { tap } from 'rxjs/operators';
import { ShopStore } from './shop.store';

@Injectable({ providedIn: 'root' })
export class ShopService {

  constructor(private shopStore: ShopStore, private http: HttpClient) {
  }

  /**
   * Productを追加する
   * 
   * @param productName productname
   * @param price price
   */
  addProduct(productName: string, price: number) {
    this.shopStore.add({
      id: guid(),
      productName,
      price
    })
  }

  removeProduct(id: ID) {
    this.shopStore.remove(id);
  }

  // get() {
  //   return this.http.get('').pipe(tap(entities => this.shopStore.set(entities)));
  // }

}
