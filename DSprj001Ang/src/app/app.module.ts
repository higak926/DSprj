import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AkitaNgDevtools } from '@datorama/akita-ngdevtools';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { CustomerService } from './service/customer.service';
import { CustomerCreateComponent } from './customer/customer-create/customer-create.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { environment } from 'src/environments/environment';
import { CounterComponent } from './counter/counter.component';
import { ShopComponent } from './shop/shop.component';
import { CustomerDetailComponent } from './customer-detail/customer-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    CustomerCreateComponent,
    CounterComponent,
    ShopComponent,
    CustomerDetailComponent
  ],
  imports: [
    environment.production ? [] : AkitaNgDevtools.forRoot(),
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgbModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
