package br.net.hnn.ufrrj.tebd;

import br.net.hnn.ufrrj.tebd.gerado.historicoescolar.HistoricoEscolar;

public interface RPCInterface {
    HistoricoEscolar getHistorico(String matricula);
}
