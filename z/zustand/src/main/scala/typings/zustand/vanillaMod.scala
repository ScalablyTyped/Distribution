package typings.zustand

import org.scalablytyped.runtime.Shortcut
import typings.std.Partial
import typings.zustand.anon.`1`
import typings.zustand.middlewareDevtoolsMod.WithDevtools
import typings.zustand.middlewareImmerMod.WithImmer
import typings.zustand.middlewarePersistMod.WithPersist
import typings.zustand.middlewareReduxMod.WithRedux
import typings.zustand.middlewareSubscribeWithSelectorMod.WithSelectorSubscribe
import typings.zustand.zustandStrings.getState
import typings.zustand.zustandStrings.setState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaMod extends Shortcut {
  
  @JSImport("zustand/vanilla", JSImport.Default)
  @js.native
  val default: CreateStore = js.native
  
  @js.native
  trait CreateStore extends StObject {
    
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
    Ms extends [] ? S : Ms extends [[infer Mi, infer Ma], ...infer Mrs] ? zustand.zustand/vanilla.Mutate<zustand.zustand/vanilla.StoreMutators<S, Ma>[Mi & zustand.zustand/vanilla.StoreMutatorIdentifier], Mrs> : never
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
  
  type StateCreator[T, Mis /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */, Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */, U] = (js.Function4[
    /* setState */ Get[Mutate[StoreApi[T], Mis], setState, Unit], 
    /* getState */ Get[Mutate[StoreApi[T], Mis], getState, Unit], 
    /* store */ Mutate[StoreApi[T], Mis], 
    /* $$storeMutations */ Mis, 
    U
  ]) & `1`[Mos]
  
  type StateListener[T] = js.Function2[/* state */ T, /* previousState */ T, Unit]
  
  type StateSelector[T /* <: State */, U] = js.Function1[/* state */ T, U]
  
  type StateSliceListener[T] = js.Function2[/* slice */ T, /* previousSlice */ T, Unit]
  
  trait StoreApi[T] extends StObject {
    
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
    
    extension [Self <: StoreApi[?], T](x: Self & StoreApi[T]) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetState(value: () => T): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setSetState(
        value: (/* partial */ T | Partial[T] | (js.Function1[T, T | Partial[T]]), /* replace */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "setState", js.Any.fromFunction2(value))
      
      inline def setSubscribe(value: js.Function2[/* state */ T, /* prevState */ T, Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  /* keyof zustand.zustand/vanilla.StoreMutators<unknown, unknown> */ /* Rewritten from type alias, can be one of: 
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
    
    extension [Self <: StoreMutators[?, ?], S, A](x: Self & (StoreMutators[S, A])) {
      
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
  
  type _To = CreateStore
  
  /* This means you don't have to write `default`, but can instead just say `vanillaMod.foo` */
  override def _to: CreateStore = default
}
