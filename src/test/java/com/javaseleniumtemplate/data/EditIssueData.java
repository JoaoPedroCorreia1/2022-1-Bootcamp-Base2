package com.javaseleniumtemplate.data;

import com.javaseleniumtemplate.dto.IssueDTO;
import com.javaseleniumtemplate.flows.BugReportPageFlows;

public class EditIssueData {

    public static int createEditIssueRetornaId() {
        BugReportPageFlows bugReportPageFlows = new BugReportPageFlows();
        int id = bugReportPageFlows.criarIssueRetornaId(
                new IssueDTO(
                        "Daniella Maleski's Project",

                        "[All Projects] Teste JoaoSilva",
                        "always",
                        "feature",
                        "low",
                        "Desktop Windows 10",

                        "joao.silva",
                        "Summary to edit",
                        "Description to edit",
                        "1. To edit."
                                + "\n" + "2. To edit."
                                + "\n" + "3. To edit.",
                        "Additional information To edit",

                        "/files/anexoExemplo.PNG",

                        "public",
                        "desativar"
                )
        );
        return id;
    }
}
