package typings.zustand

import typings.zustand.anon.FnCallSelectorEquals
import typings.zustand.anon.WithReactReadonlyStoreApiGetServerState
import typings.zustand.anon.WithReactStoreApiunknownDestroy
import typings.zustand.anon.`0`
import typings.zustand.vanillaMod.Mutate
import typings.zustand.vanillaMod.StateCreator
import typings.zustand.vanillaMod.StoreApi
import typings.zustand.vanillaMod.StoreMutatorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("zustand/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @deprecated Use `import { create } from 'zustand'`
    */
  @JSImport("zustand/react", JSImport.Default)
  @js.native
  val default: Create_ = js.native
  
  @JSImport("zustand/react", "create")
  @js.native
  val create: Create_ = js.native
  
  inline def useStore[S /* <: WithReactStoreApiunknownDestroy */](api: S): ExtractState[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any]).asInstanceOf[ExtractState[S]]
  inline def useStore[S /* <: WithReactStoreApiunknownDestroy */, U](api: S, selector: js.Function1[/* state */ ExtractState[S], U]): U = (^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[U]
  inline def useStore[S /* <: WithReactStoreApiunknownDestroy */, U](
    api: S,
    selector: js.Function1[/* state */ ExtractState[S], U],
    equalityFn: js.Function2[/* a */ U, /* b */ U, Boolean]
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[U]
  
  @js.native
  trait Create_ extends StObject {
    
    def apply[T](): js.Function1[
        /* initializer */ StateCreator[T, js.Array[Any], js.Array[Any], T], 
        UseBoundStore[Mutate[StoreApi[T], js.Array[Any]]]
      ] = js.native
    /**
      * @deprecated Use `useStore` hook to bind store
      */
    def apply[S /* <: StoreApi[Any] */](store: S): UseBoundStore[S] = js.native
    def apply[T, Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */](initializer: StateCreator[T, js.Array[Any], Mos, T]): UseBoundStore[Mutate[StoreApi[T], Mos]] = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    S extends {getState (): infer T} ? T : never
    }}}
    */
  @js.native
  trait ExtractState[S] extends StObject
  
  /* Inlined std.Pick<zustand.zustand/vanilla.StoreApi<T>, 'getState' | 'subscribe'> */
  trait ReadonlyStoreApi[T] extends StObject {
    
    var getState: js.Function0[T]
    
    var subscribe: js.Function1[
        /* listener */ js.Function2[/* state */ T, /* prevState */ T, Unit], 
        js.Function0[Unit]
      ]
  }
  object ReadonlyStoreApi {
    
    inline def apply[T](
      getState: () => T,
      subscribe: /* listener */ js.Function2[/* state */ T, /* prevState */ T, Unit] => js.Function0[Unit]
    ): ReadonlyStoreApi[T] = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[ReadonlyStoreApi[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyStoreApi[?], T] (val x: Self & ReadonlyStoreApi[T]) extends AnyVal {
      
      inline def setGetState(value: () => T): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setSubscribe(value: /* listener */ js.Function2[/* state */ T, /* prevState */ T, Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  type UseBoundStore[S /* <: WithReactReadonlyStoreApiGetServerState */] = FnCallSelectorEquals[S] & S
  
  type WithReact[S /* <: ReadonlyStoreApi[Any] */] = S & `0`[S]
}
