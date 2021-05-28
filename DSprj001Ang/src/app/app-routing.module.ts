import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomerCreateComponent } from './customer/customer-create/customer-create.component';
import { CustomerComponent } from './customer/customer.component';

const routes: Routes = [
  { path: 'customer', component: CustomerComponent},
  { path: 'customer/create', component: CustomerCreateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
