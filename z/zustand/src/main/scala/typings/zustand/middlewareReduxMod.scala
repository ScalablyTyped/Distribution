package typings.zustand

import typings.std.Omit
import typings.zustand.vanillaMod.StateCreator
import typings.zustand.zustandBooleans.`true`
import typings.zustand.zustandStrings.zustandSlashredux
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareReduxMod {
  
  @JSImport("zustand/middleware/redux", "redux")
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReduxState[?], A] (val x: Self & ReduxState[A]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StoreRedux[?], A] (val x: Self & StoreRedux[A]) extends AnyVal {
      
      inline def setDispatch(value: A => A): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setDispatchFromDevtools(value: `true`): Self = StObject.set(x, "dispatchFromDevtools", value.asInstanceOf[js.Any])
    }
  }
  
  type WithRedux[S, A] = Write[S, StoreRedux[A]]
  
  type Write[T, U] = (Omit[T, /* keyof U */ String]) & U
  
  /* augmented module */
  object zustandVanillaAugmentingMod {
    
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StoreMutators[?, ?], S, A] (val x: Self & (StoreMutators[S, A])) extends AnyVal {
        
        inline def setZustandSlashredux(value: WithRedux[S, A]): Self = StObject.set(x, "zustand/redux", value.asInstanceOf[js.Any])
      }
    }
  }
}
