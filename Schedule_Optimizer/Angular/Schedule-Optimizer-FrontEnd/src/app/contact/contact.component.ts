import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {
  title = 'Simple Example Contact-us page using Angular 4';
  public data:any=[]
  
  constructor() { }

  ngOnInit(): void {
  }

}
