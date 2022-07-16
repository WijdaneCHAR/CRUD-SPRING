import { Injectable } from '@angular/core';
import{Observable}from'rxjs';
import { HttpClient } from '@angular/common/http';
import { Item } from './Model/Item';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  private apiServerUrl=environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getItems():Observable<Item[]>{
    return this.http.get<Item[]>(this.apiServerUrl + '/item/all');
 }
}

