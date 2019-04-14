package br.net.hnn.ufrrj.tebd;

import br.net.hnn.ufrrj.tebd.gerado.historicoescolar.HistoricoEscolar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class HackyRPC implements RPCInterface {
    private HistoricoEscolar historicoEscolar;

    public HackyRPC() throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(HistoricoEscolar.class);
        Unmarshaller u = ctx.createUnmarshaller();
        this.historicoEscolar = (HistoricoEscolar) u.unmarshal(new File("historico.xml"));
    }

    @Override
    public HistoricoEscolar getHistorico(String matricula) {
        if (historicoEscolar.getAluno().getMatricula().equals(matricula)) {
            return historicoEscolar;
        }

        throw new IllegalArgumentException();
    }
}
