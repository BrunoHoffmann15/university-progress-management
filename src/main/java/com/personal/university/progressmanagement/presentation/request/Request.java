package com.personal.university.progressmanagement.presentation.request;

public interface Request<T> {
    T translateToDomain();
}
