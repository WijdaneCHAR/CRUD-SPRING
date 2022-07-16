import { Component, OnInit } from '@angular/core';
import { ItemService } from './item.service';
import { Item } from './Model/Item';
import {AfterViewInit, ViewChild} from '@angular/core';
import {MatPaginator} from '@angular/material/paginator';
import {MatTableDataSource} from '@angular/material/table';
import {MatSort} from '@angular/material/sort';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit,AfterViewInit{
  title = 'crud';
  public items!: Item[];
  displayedColumns: string[] = ['name', 'price'];
  dataSource : any ;
  @ViewChild(MatPaginator)
  paginator!: MatPaginator;
  @ViewChild(MatSort)
  sort!: MatSort;
  constructor(private itemService: ItemService) { }
  ngAfterViewInit(): void {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }
  ngOnInit(){
    this.getItems();
  }

  public getItems(): void{

    this.itemService.getItems().subscribe(
      (response : Item[]) => { this.dataSource = new MatTableDataSource<Item>(response)}
    );
  }

}
