package typings.zalgoPromise

import typings.std.Partial
import typings.zalgoPromise.anon.Cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  @JSImport("zalgo-promise/promise", "ZalgoPromise")
  @js.native
  open class ZalgoPromise[R] () extends StObject {
    def this(handler: js.Function2[
            /* resolve */ js.Function1[/* result */ R, Unit], 
            /* reject */ js.Function1[/* error */ Any, Unit], 
            Unit
          ]) = this()
    
    def asyncReject(error: Any): this.type = js.native
    
    def `catch`[X](onError: js.Function1[/* error */ Any, ZalgoPromise[X]]): ZalgoPromise[X] = js.native
    @JSName("catch")
    def catch_Y[Y](onError: js.Function1[/* error */ Any, Y]): ZalgoPromise[Y] = js.native
    
    def dispatch(): Unit = js.native
    
    def `finally`(onFinally: js.Function0[Any]): this.type = js.native
    
    def `lazy`(): this.type = js.native
    
    def reject(error: Any): this.type = js.native
    
    def resolve(result: R): this.type = js.native
    
    def `then`[X](): ZalgoPromise[X] = js.native
    def `then`[X](onSuccess: js.Function1[/* result */ R, ZalgoPromise[X]]): ZalgoPromise[X] = js.native
    def `then`[X](
      onSuccess: js.Function1[/* result */ R, ZalgoPromise[X]],
      onError: js.Function1[/* error */ Any, ZalgoPromise[X]]
    ): ZalgoPromise[X] = js.native
    def `then`[X](onSuccess: Unit, onError: js.Function1[/* error */ Any, ZalgoPromise[X]]): ZalgoPromise[X] = js.native
    // to support mixed promise/non-promise return types
    @JSName("then")
    def then_XY[X, Y](
      onSuccess: js.Function1[/* result */ R, ZalgoPromise[X] | Y],
      onError: js.Function1[/* error */ Any, ZalgoPromise[X] | Y]
    ): ZalgoPromise[X | Y] = js.native
    @JSName("then")
    def then_Y[Y](): ZalgoPromise[Y] = js.native
    @JSName("then")
    def then_Y[Y](onSuccess: js.Function1[/* result */ R, Y]): ZalgoPromise[Y] = js.native
    @JSName("then")
    def then_Y[Y](onSuccess: js.Function1[/* result */ R, Y], onError: js.Function1[/* error */ Any, Y]): ZalgoPromise[Y] = js.native
    @JSName("then")
    def then_Y[Y](onSuccess: Unit, onError: js.Function1[/* error */ Any, Y]): ZalgoPromise[Y] = js.native
    
    def timeout(time: Double): this.type = js.native
    def timeout(time: Double, err: js.Error): this.type = js.native
    
    def toPromise(): js.Promise[R] = js.native
  }
  /* static members */
  object ZalgoPromise {
    
    @JSImport("zalgo-promise/promise", "ZalgoPromise")
    @js.native
    val ^ : js.Any = js.native
    
    inline def all[X /* <: js.Array[Any] */](promises: X): ZalgoPromise[FlattenPromises[X]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[ZalgoPromise[FlattenPromises[X]]]
    
    inline def asyncReject(error: Any): ZalgoPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncReject")(error.asInstanceOf[js.Any]).asInstanceOf[ZalgoPromise[Any]]
    
    inline def delay(delay: Double): ZalgoPromise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any]).asInstanceOf[ZalgoPromise[Unit]]
    
    inline def flush(): ZalgoPromise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[ZalgoPromise[Unit]]
    
    inline def hash[O /* <: js.Object */](promises: O): ZalgoPromise[FlattenPromises[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(promises.asInstanceOf[js.Any]).asInstanceOf[ZalgoPromise[FlattenPromises[O]]]
    
    inline def isPromise(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def map[T, X](items: js.Array[T], method: js.Function1[/* item */ T, ZalgoPromise[X] | X]): ZalgoPromise[js.Array[X]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(items.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[ZalgoPromise[js.Array[X]]]
    
    inline def onPossiblyUnhandledException(handler: js.Function1[/* err */ Any, Unit]): Cancel = ^.asInstanceOf[js.Dynamic].applyDynamic("onPossiblyUnhandledException")(handler.asInstanceOf[js.Any]).asInstanceOf[Cancel]
    
    inline def reject(error: Any): ZalgoPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(error.asInstanceOf[js.Any]).asInstanceOf[ZalgoPromise[Any]]
    
    inline def resolve(): ZalgoPromise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[ZalgoPromise[Unit]]
    inline def resolve[Y](value: Y): ZalgoPromise[Y] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[ZalgoPromise[Y]]
    inline def resolve[X](value: ZalgoPromise[X]): ZalgoPromise[X] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[ZalgoPromise[X]]
    
    // to support conditional promising returning method
    inline def `try`[X, A /* <: js.Array[Any] */](method: js.Function1[/* args */ A, js.UndefOr[ZalgoPromise[X]]]): ZalgoPromise[js.UndefOr[X]] = ^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any]).asInstanceOf[ZalgoPromise[js.UndefOr[X]]]
    inline def `try`[X, A /* <: js.Array[Any] */](method: js.Function1[/* args */ A, js.UndefOr[ZalgoPromise[X]]], context: Any): ZalgoPromise[js.UndefOr[X]] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ZalgoPromise[js.UndefOr[X]]]
    inline def `try`[X, A /* <: js.Array[Any] */](method: js.Function1[/* args */ A, js.UndefOr[ZalgoPromise[X]]], context: Any, args: Partial[A]): ZalgoPromise[js.UndefOr[X]] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ZalgoPromise[js.UndefOr[X]]]
    inline def `try`[X, A /* <: js.Array[Any] */](method: js.Function1[/* args */ A, js.UndefOr[ZalgoPromise[X]]], context: Unit, args: Partial[A]): ZalgoPromise[js.UndefOr[X]] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ZalgoPromise[js.UndefOr[X]]]
    
    inline def try_YA[Y, A /* <: js.Array[Any] */](method: js.Function1[/* args */ A, Y]): ZalgoPromise[Y] = ^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any]).asInstanceOf[ZalgoPromise[Y]]
    inline def try_YA[Y, A /* <: js.Array[Any] */](method: js.Function1[/* args */ A, Y], context: Any): ZalgoPromise[Y] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ZalgoPromise[Y]]
    inline def try_YA[Y, A /* <: js.Array[Any] */](method: js.Function1[/* args */ A, Y], context: Any, args: Partial[A]): ZalgoPromise[Y] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ZalgoPromise[Y]]
    inline def try_YA[Y, A /* <: js.Array[Any] */](method: js.Function1[/* args */ A, Y], context: Unit, args: Partial[A]): ZalgoPromise[Y] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ZalgoPromise[Y]]
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K] extends zalgo-promise.zalgo-promise/promise.ZalgoPromise<any>? zalgo-promise.zalgo-promise/promise.ResultType<T[K]> : T[K]}
    }}}
    */
  @js.native
  trait FlattenPromises[T /* <: js.Object */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    P extends zalgo-promise.zalgo-promise/promise.ZalgoPromise<infer R> ? R : never
    }}}
    */
  @js.native
  trait ResultType[P /* <: ZalgoPromise[Any] */] extends StObject
}
