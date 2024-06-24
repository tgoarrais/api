-- Adicionar a coluna temporária
ALTER TABLE medicos ADD COLUMN ativo_temp BOOLEAN;

-- Atualizar os valores com a conversão apropriada
UPDATE medicos SET ativo_temp = (ativo = 1);

-- Remover a coluna original
ALTER TABLE medicos DROP COLUMN ativo;

-- Renomear a coluna temporária
ALTER TABLE medicos RENAME COLUMN ativo_temp TO ativo;

-- Definir o valor padrão para a nova coluna
ALTER TABLE medicos ALTER COLUMN ativo SET DEFAULT TRUE;

-- Adicionar a restrição NOT NULL se necessário
ALTER TABLE medicos ALTER COLUMN ativo SET NOT NULL;






