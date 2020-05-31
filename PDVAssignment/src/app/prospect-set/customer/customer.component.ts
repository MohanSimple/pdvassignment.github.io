import { Component, OnInit } from '@angular/core';
import { CustomerService } from 'src/app/customer.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  customers: any=[]
  constructor(private customerService: CustomerService) { }
  totalRecodrs:string;
  p:number=1;
  term:string;

  ngOnInit(): void {
    this.getDetails();
  }

  getDetails(){
    this.customerService.getDetails().subscribe(data => this.customers = data)

  }
}
