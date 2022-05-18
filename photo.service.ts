import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { photos } from './assignment1/Photos';

@Injectable({
  providedIn: 'root'
})
export class PhotoService {

  constructor(private myHttp:HttpClient) { }

  
  loadAllPhotosService():Observable<photos[]>
  {
    return this.myHttp.get<photos[]>("https://jsonplaceholder.typicode.com/photos");
  }

  loadPhotoDetailsServiceById(x:number):Observable<photos>
  {
    return this.myHttp.get<photos>("https://jsonplaceholder.typicode.com/photos/"+x);
  }

}



  
