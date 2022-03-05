#include <stdio.h>

typedef struct {
  float largura, altura;
  int Horizontais, Verticais;
} rect;

void print (rect* r) {
  printf("Retangulo de tamanho  %.1f px de largura,%.1f px de altura, %d divisores horizontais e %d divisores verticais \n", r->largura,  r-> altura, r->Horizontais, r->Verticais);
}

void main (void) {
    rect r1 = { 100,110, 30,30};
    print(&r1);
}