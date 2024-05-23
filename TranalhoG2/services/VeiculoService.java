package services;
import java.util.ArrayList;
import java.util.List;


import entities.Veiculo;

public class VeiculoService {
    private List<Veiculo> veiculosDB;
    

    public List<Veiculo> getVeiculosDB() {
        return veiculosDB;
    }

    public VeiculoService() {
        this.veiculosDB = new ArrayList<>();
    }
    
    public Veiculo save(Veiculo veiculo) throws Exception {
        if (veiculo == null)
            throw new Exception("Objeto nulo");
        if (veiculo.getModelo() == null || veiculo.getModelo().isEmpty())
            throw new Exception("Campo Modelo não pode ser em branco");
        if (veiculo.getMarca() == null || veiculo.getMarca().isEmpty())
            throw new Exception("Campo Marca não pode ser em branco");
        veiculosDB.add(veiculo);
        return veiculo;
    }

    public Veiculo pesquisarVeiculos(String placa){
    List<Veiculo> veiculos = getVeiculosDB(); 
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    public Veiculo removerVeiculo(String placa){
        List<Veiculo> veiculos = getVeiculosDB();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    
}
