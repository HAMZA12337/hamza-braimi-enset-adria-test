import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CustomersComponent} from "./customers/customers.component";
import { PageComponent } from './main_page/page.component';

const routes: Routes = [
 
  {path : "customers", component : CustomersComponent
  },
  
  {path:"PageComponent",component :  PageComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
