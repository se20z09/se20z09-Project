import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {

  constructor(private router: Router) { }
  ngOnInit(): void {
  }

  redirectGit() {
    window.location.href = "https://github.com/se20z09/se20z09-Project";
  }

  myPack() {
    window.location.href = "https://portalsp.acs.ncsu.edu/";
  }
}
