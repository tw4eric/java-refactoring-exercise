package com.eric4tw.pair2;


public enum Direction {
    N {
        @Override
        public Direction moveLeft()
        {
            // TODO Auto-generated method stub
            return Direction.E;
               
        }
        @Override
        public Direction moveRight()
        {
            // TODO Auto-generated method stub
            return Direction.W;
        }
        
    },S {
        @Override
        public Direction moveLeft()
        {
            // TODO Auto-generated method stub
            return Direction.E;
            
        }
        @Override
        public Direction moveRight()
        {
            // TODO Auto-generated method stub
            return Direction.W;
            
        }
    },E {
        @Override
        public Direction moveLeft()
        {
            // TODO Auto-generated method stub
            return Direction.N;
            
        }
        @Override
        public Direction moveRight()
        {
            // TODO Auto-generated method stub
            return Direction.S;
            
        }
    },W {
        @Override
        public Direction moveLeft()
        {
            // TODO Auto-generated method stub
            return Direction.S;
            
        }
        @Override
        public Direction moveRight()
        {
            // TODO Auto-generated method stub
            return Direction.N;
            
        }
    };
      
   
    public abstract Direction moveLeft();
   
    public abstract Direction moveRight();
 
       
 }