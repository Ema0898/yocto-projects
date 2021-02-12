.PHONY: all

STATIC=calculadora_e
DYNAMIC=calculadora_d
ROUTE=../bin/
STATICFLAGS=../lib/liboperaciones.a -I../include -lm
STATICROUTE=$(ROUTE)calculadora_e
DYNAMICFLAGS=-Bdynamic -L../lib -I../include -loperaciones -lm
DYNAMICROUTE=$(ROUTE)calculadora_d
SRC=calculadora.c

all: $(STATIC) $(DYNAMIC)

$(STATIC): 
		$(CC) -o $(STATICROUTE) $(SRC) $(STATICFLAGS) -O

$(DYNAMIC):
		$(CC) -o $(DYNAMICROUTE) $(SRC) $(DYNAMICFLAGS) -O
