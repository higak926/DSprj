import { ID } from '@datorama/akita';

export interface Shop {
  id: ID;
  productName: string;
  price: number;
}

export function createShop(params: Partial<Shop>) {
  return {

  } as Shop;
}
