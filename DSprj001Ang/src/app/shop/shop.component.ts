import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { getEntityType } from '@datorama/akita';
import { Observable } from 'rxjs';
import { ShopQuery } from './shop.query';
import { ShopService } from './shop.service';
import { ShopState } from './shop.store';

@Component({
  selector: 'app-shop',
  templateUrl: './shop.component.html',
  styleUrls: ['./shop.component.scss']
})
export class ShopComponent implements OnInit {

  readonly allProduct$: Observable<getEntityType<ShopState>[]>
  formGroup: FormGroup;

  constructor(private shopService: ShopService, private shopQuery: ShopQuery, private formBuilder: FormBuilder) {
    this.allProduct$ = this.shopQuery.selectAll();
    this.formGroup = this.formBuilder.group({
      productName: '',
      price: 0
    })
  }

  ngOnInit(): void {
  }

  addProduct() {    
    this.shopService.addProduct(this.formGroup.get('productName')!.value, this.formGroup.get('price')!.value);
  }

}
