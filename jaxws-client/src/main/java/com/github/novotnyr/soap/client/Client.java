package com.github.novotnyr.soap.client;

import com.github.novotnyr.soap.server.DefaultTermService;
import com.github.novotnyr.soap.server.DefaultTermServiceService;
import com.github.novotnyr.soap.server.Term;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        DefaultTermServiceService serviceLocator = new DefaultTermServiceService();
        DefaultTermService termService = serviceLocator.getDefaultTermServicePort();
        List<Term> terms = termService.getTerms("UINF/PAZ1c");
        for (Term term : terms) {
            System.out.printf("%s - %d slots left\n", term.getDate(), term.getFreeSlots());
        }
    }
}