import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private httpClient :HttpClient) { }

  url:string ="http://localhost:8080/api/details";

  getDetails(){
    return this.httpClient.get(this.url);
  }

  deleteDetails(id:number){
    return this.httpClient.delete(`${this.url}/${id}`);
  }
}
