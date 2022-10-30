package com.github.novotnyr.soap.server;

import jakarta.jws.WebService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebService
public class DefaultTermService {
    private List<Term> terms = new ArrayList<Term>();

    public DefaultTermService() {
        terms.add(new Term(LocalDate.of(2022, 12, 12), "UINF/PAZ1c", 100));
        terms.add(new Term(LocalDate.of(2022, 12, 15), "UINF/PAZ1c", 75));
        terms.add(new Term(LocalDate.of(2023, 1, 5), "UINF/TVY1a", 50));
    }

    public List<Term> getTerms(String courseCode) {
        return terms.stream()
                .filter(term -> term.getCourseCode().equals(courseCode))
                .collect(Collectors.toList());
    }
}