import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CounterComponent } from './counter/counter.component';
import { CustomerCreateComponent } from './customer/customer-create/customer-create.component';
import { CustomerComponent } from './customer/customer.component';
import { ShopComponent } from './shop/shop.component';

const routes: Routes = [
  { path: 'customer', component: CustomerComponent},
  { path: 'customer/create', component: CustomerCreateComponent},
  { path: 'counter', component: CounterComponent},
  { path: 'shop', component: ShopComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
