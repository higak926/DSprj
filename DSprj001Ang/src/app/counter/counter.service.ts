import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { tap } from 'rxjs/operators';
import { CounterStore } from './counter.store';

@Injectable({ providedIn: 'root' })
export class CounterService {

  constructor(private counterStore: CounterStore, private http: HttpClient) {
  }

  increment() {
    this.counterStore.update(store => ({
      ...store,
      favorite: store.favorite + 1
    }));
  }
}
