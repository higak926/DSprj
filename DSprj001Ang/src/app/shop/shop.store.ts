import { Injectable } from '@angular/core';
import { EntityState, EntityStore, StoreConfig } from '@datorama/akita';
import { Shop } from './shop.model';

export interface ShopState extends EntityState<Shop> {}

@Injectable({ providedIn: 'root' })
@StoreConfig({
  name: 'shop'
})
export class ShopStore extends EntityStore<ShopState> {

  constructor() {
    super();
  }

}
