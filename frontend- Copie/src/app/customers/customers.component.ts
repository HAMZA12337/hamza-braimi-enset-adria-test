import { Component,OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";
import Swal from 'sweetalert2';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {

  customers : any;
  constructor(private http:HttpClient, private router: Router, private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.http.get("http://localhost:9999/wallet-service/wallets").subscribe({
      next:(data)=>{

      this.customers=data;


      },error:(err)=>{

      }
    })

  }
 
  
  getClient(c: any) {
    Swal.fire({
      title: 'Do you want get his client?',
      showDenyButton: false,
      showCancelButton: true,
      confirmButtonText: 'Delete',
    }).then((result) => {
      if (result.isConfirmed) {
        this.router.navigateByUrl("/orders/" + c.id);
      } else {
        alert("hhhh");
      }
    });


    
  }
  









}
