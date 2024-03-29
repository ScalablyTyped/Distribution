package typings.zustand

import org.scalablytyped.runtime.Shortcut
import typings.std.Partial
import typings.zustand.esmMiddlewareDevtoolsMod.WithDevtools
import typings.zustand.esmMiddlewareImmerMod.WithImmer
import typings.zustand.esmMiddlewarePersistMod.WithPersist
import typings.zustand.esmMiddlewareReduxMod.WithRedux
import typings.zustand.esmMiddlewareSubscribeWithSelectorMod.WithSelectorSubscribe
import typings.zustand.zustandStrings.getState
import typings.zustand.zustandStrings.setState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmVanillaMod extends Shortcut {
  
  /**
    * @deprecated Use `import { createStore } from 'zustand/vanilla'`
    */
  @JSImport("zustand/esm/vanilla", JSImport.Default)
  @js.native
  val default: CreateStore_ = js.native
  
  @JSImport("zustand/esm/vanilla", "createStore")
  @js.native
  val createStore: CreateStore_ = js.native
  
  @js.native
  trait CreateStore_ extends StObject {
    
    def apply[T](): js.Function1[
        /* initializer */ StateCreator[T, js.Array[Any], js.Array[Any], T], 
        Mutate[StoreApi[T], js.Array[Any]]
      ] = js.native
    def apply[T, Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */](initializer: StateCreator[T, js.Array[Any], Mos, T]): Mutate[StoreApi[T], Mos] = js.native
  }
  
  type Destroy = js.Function0[Unit]
  
  type EqualityChecker[T] = js.Function2[/* state */ T, /* newState */ T, Boolean]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    K extends keyof T ? T[K] : F
    }}}
    */
  type Get[T, K, F] = F
  
  type GetState[T /* <: State */] = js.Function0[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    number extends Ms['length' & keyof Ms] ? S : Ms extends [] ? S : Ms extends [[infer Mi, infer Ma], ...infer Mrs] ? zustand.zustand/esm/vanilla.Mutate<zustand.zustand/esm/vanilla.StoreMutators<S, Ma>[Mi & zustand.zustand/esm/vanilla.StoreMutatorIdentifier], Mrs> : never
    }}}
    */
  type Mutate[S, Ms] = S
  
  type PartialState[T /* <: State */] = Partial[T] | (js.Function1[/* state */ T, Partial[T]])
  
  type SetState[T /* <: State */] = js.Function2[
    /* partial */ T | Partial[T] | (js.Function1[/* state */ T, T | Partial[T]]), 
    /* replace */ js.UndefOr[Boolean], 
    Unit
  ]
  
  type SetStateInternal[T] = js.Function2[
    /* partial */ T | Partial[T] | (js.Function1[/* state */ T, T | Partial[T]]), 
    /* replace */ js.UndefOr[Boolean], 
    Unit
  ]
  
  type State = Any
  
  type StateCreator[T, Mis /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */, Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */, U] = (js.Function3[
    /* setState */ Get[Mutate[StoreApi[T], Mis], setState, scala.Nothing], 
    /* getState */ Get[Mutate[StoreApi[T], Mis], getState, scala.Nothing], 
    /* store */ Mutate[StoreApi[T], Mis], 
    U
  ]) & typings.zustand.anon.StoreMutators[Mos]
  
  type StateListener[T] = js.Function2[/* state */ T, /* previousState */ T, Unit]
  
  type StateSelector[T /* <: State */, U] = js.Function1[/* state */ T, U]
  
  type StateSliceListener[T] = js.Function2[/* slice */ T, /* previousSlice */ T, Unit]
  
  trait StoreApi[T] extends StObject {
    
    /**
      * @deprecated Use `unsubscribe` returned by `subscribe`
      */
    def destroy(): Unit
    
    def getState(): T
    
    var setState: SetStateInternal[T]
    
    def subscribe(listener: js.Function2[/* state */ T, /* prevState */ T, Unit]): js.Function0[Unit]
  }
  object StoreApi {
    
    inline def apply[T](
      destroy: () => Unit,
      getState: () => T,
      setState: (/* partial */ T | Partial[T] | (js.Function1[T, T | Partial[T]]), /* replace */ js.UndefOr[Boolean]) => Unit,
      subscribe: js.Function2[/* state */ T, /* prevState */ T, Unit] => js.Function0[Unit]
    ): StoreApi[T] = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction2(setState), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[StoreApi[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StoreApi[?], T] (val x: Self & StoreApi[T]) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetState(value: () => T): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setSetState(
        value: (/* partial */ T | Partial[T] | (js.Function1[T, T | Partial[T]]), /* replace */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "setState", js.Any.fromFunction2(value))
      
      inline def setSubscribe(value: js.Function2[/* state */ T, /* prevState */ T, Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  /* keyof zustand.zustand/esm/vanilla.StoreMutators<unknown, unknown> */ /* Rewritten from type alias, can be one of: 
    - typings.zustand.zustandStrings.zustandSlashdevtools
    - typings.zustand.zustandStrings.zustandSlashimmer
    - typings.zustand.zustandStrings.zustandSlashpersist
    - typings.zustand.zustandStrings.zustandSlashredux
    - typings.zustand.zustandStrings.zustandSlashsubscribeWithSelector
  */
  trait StoreMutatorIdentifier extends StObject
  
  trait StoreMutators[S, A] extends StObject {
    
    @JSName("zustand/devtools")
    var zustandSlashdevtools: WithDevtools[S]
    
    @JSName("zustand/immer")
    var zustandSlashimmer: WithImmer[S]
    
    @JSName("zustand/persist")
    var zustandSlashpersist: WithPersist[S, A]
    
    @JSName("zustand/redux")
    var zustandSlashredux: WithRedux[S, A]
    
    @JSName("zustand/subscribeWithSelector")
    var zustandSlashsubscribeWithSelector: WithSelectorSubscribe[S]
  }
  object StoreMutators {
    
    inline def apply[S, A](
      zustandSlashdevtools: WithDevtools[S],
      zustandSlashimmer: WithImmer[S],
      zustandSlashpersist: WithPersist[S, A],
      zustandSlashredux: WithRedux[S, A],
      zustandSlashsubscribeWithSelector: WithSelectorSubscribe[S]
    ): StoreMutators[S, A] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("zustand/devtools")(zustandSlashdevtools.asInstanceOf[js.Any])
      __obj.updateDynamic("zustand/immer")(zustandSlashimmer.asInstanceOf[js.Any])
      __obj.updateDynamic("zustand/persist")(zustandSlashpersist.asInstanceOf[js.Any])
      __obj.updateDynamic("zustand/redux")(zustandSlashredux.asInstanceOf[js.Any])
      __obj.updateDynamic("zustand/subscribeWithSelector")(zustandSlashsubscribeWithSelector.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreMutators[S, A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StoreMutators[?, ?], S, A] (val x: Self & (StoreMutators[S, A])) extends AnyVal {
      
      inline def setZustandSlashdevtools(value: WithDevtools[S]): Self = StObject.set(x, "zustand/devtools", value.asInstanceOf[js.Any])
      
      inline def setZustandSlashimmer(value: WithImmer[S]): Self = StObject.set(x, "zustand/immer", value.asInstanceOf[js.Any])
      
      inline def setZustandSlashpersist(value: WithPersist[S, A]): Self = StObject.set(x, "zustand/persist", value.asInstanceOf[js.Any])
      
      inline def setZustandSlashredux(value: WithRedux[S, A]): Self = StObject.set(x, "zustand/redux", value.asInstanceOf[js.Any])
      
      inline def setZustandSlashsubscribeWithSelector(value: WithSelectorSubscribe[S]): Self = StObject.set(x, "zustand/subscribeWithSelector", value.asInstanceOf[js.Any])
    }
  }
  
  type Subscribe[T /* <: State */] = js.Function1[
    /* listener */ js.Function2[/* state */ T, /* previousState */ T, Unit], 
    js.Function0[Unit]
  ]
  
  type _To = CreateStore_
  
  /* This means you don't have to write `default`, but can instead just say `esmVanillaMod.foo` */
  override def _to: CreateStore_ = default
}
