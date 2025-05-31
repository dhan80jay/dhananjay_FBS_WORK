//Area of room
void main ()
{
	//room area = 144sq m; Size of tiles = 12*12sq
	int roomArea,tiles,coverArea;
	roomArea = 144 * 10000;
	printf("Area of room is %dsq cm\n",roomArea);
	tiles = 12*12;
	printf("Size of tiles is %dsq cm\n",tiles);	
	coverArea = roomArea/tiles;
	printf("Tiles will be required %d ",coverArea);
}