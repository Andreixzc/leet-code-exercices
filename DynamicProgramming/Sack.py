def fn(n, W):
    # Caso base: Se não houver itens ou capacidade zero, o valor é zero.
    if n == 0 or W == 0:
        print(f"Chamada recursiva: fn(n={n}, W={W}) - Valor é 0 (base case)")
        return 0

    # Se o peso do item atual for maior que a capacidade da mochila, não podemos incluí-lo.
    if w[n - 1] > W:
        print(f"Chamada recursiva: fn(n={n}, W={W}) - Peso do item {n} ({w[n-1]}) é maior que a capacidade disponível ({W}), excluindo o item.")
        return fn(n - 1, W)

    # Caso contrário, consideramos duas opções: incluir o item ou não.
    include_current = v[n - 1] + fn(n - 1, W - w[n - 1])
    exclude_current = fn(n - 1, W)
    
    if include_current > exclude_current:
        print(f"Chamada recursiva: fn(n={n}, W={W}) - Incluindo o item {n} ({w[n-1]}), Valor incluído: {include_current}")
    else:
        print(f"Chamada recursiva: fn(n={n}, W={W}) - Excluindo o item {n} ({w[n-1]}), Valor excluído: {exclude_current}")
    
    return max(include_current, exclude_current)

# Vetores de valores e pesos
v = [60, 100, 120]
w = [10, 20, 30]

# Capacidade da mochila
W = 50

# Chamada inicial
result = fn(len(v), W)
print(f"O valor máximo que pode ser colocado na mochila é: {result}")
