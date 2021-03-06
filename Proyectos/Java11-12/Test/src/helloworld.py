#coding: utf-8 && iso-8859-1
'''
Created on 24/05/2012
@author: JaVi
'''

print('Hello,World')

from math import sin                           #importo de la clase math el seno (sin)
#radio = int(input ('Dame el radio:'))          #leo por consola un int y lo paso a la variable radio
radio = 4
print(sin(radio))                              #imprimo por consola el seno de lo que pase a radio
print('Hola')
print(type (radio))                            #type: devuelve el tipo de la variable que le pasamos (int, float, String)
print('Hola '*3)                               #repite tres veces la cadena que le hayamos puesto antes
print(len('Hola '))                            #len nos devuelve la longitud de la cadena
cadena = 'Hola'
print(cadena.capitalize())                     #devuelve la cadena con la primera letra en mayusculas
print(cadena.upper())                          #devuelve la cadena con todas las letras en mayusculas
print(cadena.lower())                          #devuelve la cadena con todas las letras en minusculas
print(cadena[3])                               #devuelve el caracter de esa posicion como si fuera un array de char
s=[1,2,3,4,6,5]
print(s)                                       #devuelve toda la lista de 's'
s.sort()                                       #devuelve la lista ordenada de menor a mayor
print(s)
tel={}                                         #creo el diccionario
tel["luis"]=1234                               #agrego al diccionario entradas
tel["maria"]=5678
tel["pepe"]=9012
print(tel["maria"])                            #imprimo el valor de esa entrada
print(tel)                                     #imprimo todo el diccionario
print(tel.keys())                              #devuelve true si esta la clave en el diccionario

if radio>4:                                    #if
    print("Mayor")
elif radio==4:                                 #else if
    print("Igual")
else:                                          #else
    print("Menor")

'''                                            #while
l=range(8)
while l:
    print(l[-1]),
    del(l[-1])
'''

a=['primero', 'segundo', 'tercero']

for i in a:                                    #for
    print(i)


def fib(n):
    a,b = 0,1
    r=[]
    while b<n:
        r.append(b)
        a,b=b,a+b
    return r
print(fib(10))



def crea_arbol():
    return None

def inserta(A,c):
    if A==None:
        return (None,c,None)
    elif c<A[1]:
        return (inserta(A[0],c),A[1],A[2])
    elif c>A[1]:
        return (A[0],A[1],inserta(A[2],c))
    else:
        return A

def pertenece(A,c):
    if A==None:
        return True
    elif c<A[1]:
        return False
    elif c>A[1]:
        return pertenece(A[0],c)
    else:
        return pertenece(A[2],c)
        

A= crea_arbol()

A= inserta(A, 'diminuto')

A= inserta(A, "mediano")
A= inserta(A, "grande")
A= inserta(A, "diminuto")

print(A)

print(pertenece(A, "mediano"))


class MiExcepcion(Exception):
    def __init__(self, mensaje):
        self.mensaje=mensaje

'''
try:
    raise MiExcepcion("Esto lo lanzo yo")
except(MiExcepcion, excepcion):
    print(excepcion.mensaje)
'''

class Clase:
    def __init__(self,v):
        self.v=v
    
a=Clase(3)
print(a.__dict__)                           #da los atributos y sus valores
print(a.__class__.__name__)                 #da el nombre de la clase en que esta instanciada


class Base:                                                     #Clases derivadas
    def __init__(self,v):
        self.v=v
        print('Inicializo la base con un %d' %v)
    def f1(self,n):
        return 'f1 de la base recibe un %d' %n
    def f2(self,n):
        return 'f2 de la base recibe un %d' %n

class Derivada(Base):
    def __init__(self,v):
        Base.__init__(self, v)
        print("Se ha inicializado la derivada con %d" %self.v)
    def f2(self,n):
        return 'f2 de la derivada recibe un %d' %n

a=Derivada(4)
print(a.f1(2))
print(a.f2(2))


class Arbol:
    def __init__(self,elto):
        self.elto=elto
        self.izdo=None
        self.dcho=None
    def inserta(self,nuevo):
        if nuevo == self.elto:
            return self
        elif nuevo<self.elto:
            if self.izdo == None:
                self.izdo = Arbol(nuevo)
            else:
                self.izdo=self.izdo.inserta(nuevo)
        else:
            if self.dcho == None:
                self.dcho = Arbol(nuevo)
            else:
                self.dcho=self.dcho.inserta(nuevo)
        return self
    
    def esta(self, buscado):
        if buscado == self.elto:
            return True
        elif buscado<self.elto:
            if self.izdo == None:
                return False
            else:
                return self.izdo.esta(buscado)
        else:
            if self.dcho == None:
                return False
            else:
                return self.dcho.esta(buscado)


class AST:
    def __init__(self):pass
    def mostrar(self):pass
    def numero_operaciones(self):pass
    def interperta(self):pass
    
class Numero(AST):
    def __init__(self, valor):
        self.valor=valor
    def mostrar(self):
        return str(self.valor)
    def numero_operaciones(self):
        return 0
    def interpreta(self):
        return self.valor

class Operacion(AST):
    def __init__(self,op,izda,dcha):
        self.op = op
        self.izda = izda
        self.dcha= dcha
    def mostrar(self):
        return '(' + self.izda.mostrar() + self.op + self.dcha.mostrar() + ')'
    def numero_operaciones(self):
        return 1 + self.izda.numero_operaciones() + self.dcha.numero_operaciones()
    def interpreta(self):
        if self.op=='+':
            return self.izda.interpreta() + self.dcha.interperta()
        else:
            return self.izda.interpreta() * self.dcha.interpreta()

'''
Copyright Javi S.L.
Main de las 3 clases anteriores
'''

num1 = Numero(4)
num2 = Numero(5)
num3 = Numero(3)
num4 = Numero(2)
arbol1 = Operacion('*',num1,num2)
arbol2 = Operacion('*',num3, num4)
arbol_final = Operacion('+',arbol1,arbol2)

print()
print('El arbol contiene la expresion:', arbol_final.mostrar())
print('El arbol contiene en total %d operaciones' % arbol_final.numero_operaciones())
print('La expresion se evalua como:', arbol_final.interperta())

'''
Copyright Javi S.L.
Clases para representar conjuntos de enteros no negativos
'''

print()

from types import *
from math import *

class InSet:
    def __init__(self):
        self.c = 0

    def __str__(self):
        c = self.c
        s = "{ "
        i = 0
        while c != 0:
            j = 2** int(i)
            if c & j:
                s = s + str(i) + ' '
                c = c - j
            i = i + 1
            s = s + " }"
        return s
    
    def insert(self, n):
        if type(n) != FunctionType:
            self.c = self.c | 2**int(n)
        else:
            for i in n:
                self.c = self.c | 2**int(i)
    
    def __len__(self):
        c = self.c
        i = 0
        n = 0
        while c != 0:
            j = 2**int(i)
            if c & j:
                c = c - j
                n = n + 1
            i = i + 1
        return n
    
    def __getitem__(self, i):
        return (self.c & 2**int(i)) != 0
    
    def __setitem__(self, i, v):
        s = 2**int(i)
        self.c = self.c | s
        if v == 0:
            self.c = self.c ^ s
    
    def __or__(self, right):
        R = InSet()
        R.c = self.c | right.c
        return R
    
    def __and__(self, right):
        R = InSet()
        R.c = self.c & right.c
        return R
    
    def __sub__(self, right):
        R = InSet()
        R.c = self.c ^ (self.c & right.c)
        return R


if __name__ == "__main__":
    A = InSet()
    A.insert(10)
    #A.insert([2, 4, 32])
    
    print("Conjunto A: ", A)
    print("Long:    ", len(A))
    print("¿Esta el 2?", A[2], "¿Y el 3?", A[3])
    A[3] = 1; A[2] = 0
    print("¿Esta el 2?", A[2], "¿Y el 3?", A[3])
    print("Conjunto A: ", A)
    
    B = InSet()
    B.insert(5)
    #B.insert([3, 7, 9, 32])
    
    print("B es: ", B)
    print("A union B es    ", A|B)
    print("A interseccion B es    ", A&B)
    print("A // B es    ", A-B)
    print((A|B) - (A&B) - A)


'''
Para sobreescirbir un archivo

import sys, string

nomfp="C:\Users\JaVi\Desktop\hola.txt"

fp=open(nomfp, "r")

usuarios={}
while True:
    linea = fp.realLine()
    if not linea:
        break
    campos = string.split(linea, ":")
    usuarios[campos[0]]=campos[4]
fp.close()

while True:
    sys.stdout.write("¿Usuario?: ")
    linea=sys.stdin.readline()
    if not linea:
        break
    login = string.strip(linea)
    if usuarios.fromkeys(login):
        print("  "+usuarios[login])
    else:
        print("  Usuario desconocido")
        print() 
'''