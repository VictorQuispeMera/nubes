package io.vertx.mvc.exceptions;

public class BadRequestException extends HttpException {
    private static final long serialVersionUID = -8177274609736272204L;

    public BadRequestException(String message) {
        super(400, message);
    }
}