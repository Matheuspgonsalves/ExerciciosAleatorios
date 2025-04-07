#Funções

def fat(n: int):
    resp: int
    if(n == 1):
        resp = 1
        print(f'{n} = ', end="")
    else:
        print(f'{n} * ', end="")
        resp = n * fat(n - 1)

    return resp
    
# Inicio do programa

print("CALCULADORA DE FATORIAL (Recursivo)")

num = int(input("Digite o número que deseja calcular: "))

res = fat(num)

print(f'{res}')
