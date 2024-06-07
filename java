        this.x + this.radius > paddle.x &&
        this.y + this.radius > paddle.y &&
        this.y - this.radius < paddle.y + paddle.height) {
          this.speedX *= -1;
    }
  }
  
  display() {
    fill(255);
    ellipse(this.x, this.y, this.radius * 2);
  }
}

class Paddle {
  constructor(x) {
    this.x = x;
    this.y = height / 2 - 50;
    this.width = 10;
    this.height = 100;
    this.speed = 0;
  }
  
  move(step) {
    this.speed = step;
  }
  
  stop() {
    this.speed = 0;
  }
  
  update() {
    this.y = constrain(this.y + this.speed, 0, height - this.height);
  }
  
  display() {
    fill(255);
    rect(this.x, this.y, this.width, this.height);
  }
}
