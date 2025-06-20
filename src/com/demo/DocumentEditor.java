package com.demo;

import java.util.*;

public class DocumentEditor {
    private StringBuilder documentText = new StringBuilder();
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    public void type(String text) {
        // Save state for undo
        undoStack.push(documentText.toString());
        // Clear redo because we're making a new change
        redoStack.clear();

        // Apply the new change
        documentText.append(text);
    }

    public void delete(int length) {
        if (length > documentText.length()) length = documentText.length();

        undoStack.push(documentText.toString());
        redoStack.clear();

        documentText.delete(documentText.length() - length, documentText.length());
        System.out.println("Deleted last " + length + " characters.");
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(documentText.toString());
            documentText = new StringBuilder(undoStack.pop());
            System.out.println("Undo performed.");
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(documentText.toString());
            documentText = new StringBuilder(redoStack.pop());
            System.out.println("Redo performed.");
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    public void print() {
        System.out.println("Current Document: " + documentText);
    }
}