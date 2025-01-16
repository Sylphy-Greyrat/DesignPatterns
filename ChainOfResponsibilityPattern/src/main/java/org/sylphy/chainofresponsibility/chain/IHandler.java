package org.sylphy.chainofresponsibility.chain;


import lombok.Setter;

/**
 * @className: IHandle
 * @author: Sylphy
 * @date: 2025/1/1 22:35
 * @Version: 1.0
 * @description:
 */
@Setter
public abstract class IHandler<T, R> {
    private IHandler<T, R> nextHandler;

    public boolean hasNext() {
        return this.nextHandler != null;
    }

    public R handle(T t) {
        if (this.hasNext()){
            return this.nextHandler.handle(t);
        }
        return null;
    }
}
