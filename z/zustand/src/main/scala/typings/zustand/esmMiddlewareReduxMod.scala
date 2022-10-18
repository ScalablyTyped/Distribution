package typings.zustand

import typings.std.Omit
import typings.zustand.esmVanillaMod.StateCreator
import typings.zustand.zustandBooleans.`true`
import typings.zustand.zustandStrings.zustandSlashredux
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMiddlewareReduxMod {
  
  @JSImport("zustand/esm/middleware/redux", "redux")
  @js.native
  val redux: Redux_ = js.native
  
  trait Action extends StObject {
    
    var `type`: Any
  }
  object Action {
    
    inline def apply(`type`: Any): Action = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReduxState[A] extends StObject {
    
    var dispatch: js.Function1[/* a */ A, A]
  }
  object ReduxState {
    
    inline def apply[A](dispatch: /* a */ A => A): ReduxState[A] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch))
      __obj.asInstanceOf[ReduxState[A]]
    }
    
    extension [Self <: ReduxState[?], A](x: Self & ReduxState[A]) {
      
      inline def setDispatch(value: /* a */ A => A): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    }
  }
  
  type Redux_ = js.Function2[
    /* reducer */ js.Function2[/* state */ Any, /* action */ Action, Any], 
    /* initialState */ Any, 
    StateCreator[
      Write[Any, ReduxState[Action]], 
      js.Array[Any], 
      js.Array[js.Tuple2[zustandSlashredux, Action]], 
      Write[Any, ReduxState[Action]]
    ]
  ]
  
  trait StoreRedux[A] extends StObject {
    
    def dispatch(a: A): A
    
    var dispatchFromDevtools: `true`
  }
  object StoreRedux {
    
    inline def apply[A](dispatch: A => A): StoreRedux[A] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), dispatchFromDevtools = true)
      __obj.asInstanceOf[StoreRedux[A]]
    }
    
    extension [Self <: StoreRedux[?], A](x: Self & StoreRedux[A]) {
      
      inline def setDispatch(value: A => A): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setDispatchFromDevtools(value: `true`): Self = StObject.set(x, "dispatchFromDevtools", value.asInstanceOf[js.Any])
    }
  }
  
  type WithRedux[S, A] = Write[S, StoreRedux[A]]
  
  type Write[T, U] = (Omit[T, /* keyof U */ String]) & U
  
  /* augmented module */
  object zustandEsmVanillaAugmentingMod {
    
    trait StoreMutators[S, A] extends StObject {
      
      @JSName("zustand/redux")
      var zustandSlashredux: WithRedux[S, A]
    }
    object StoreMutators {
      
      inline def apply[S, A](zustandSlashredux: WithRedux[S, A]): StoreMutators[S, A] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("zustand/redux")(zustandSlashredux.asInstanceOf[js.Any])
        __obj.asInstanceOf[StoreMutators[S, A]]
      }
      
      extension [Self <: StoreMutators[?, ?], S, A](x: Self & (StoreMutators[S, A])) {
        
        inline def setZustandSlashredux(value: WithRedux[S, A]): Self = StObject.set(x, "zustand/redux", value.asInstanceOf[js.Any])
      }
    }
  }
}
