package typings.zenObservableTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  object ZenObservable {
    
    trait ObservableLike[T] extends StObject {
      
      var subscribe: js.UndefOr[Subscriber[T]] = js.undefined
    }
    object ObservableLike {
      
      inline def apply[T](): ObservableLike[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ObservableLike[T]]
      }
      
      extension [Self <: ObservableLike[?], T](x: Self & ObservableLike[T]) {
        
        inline def setSubscribe(value: /* observer */ SubscriptionObserver[T] => Unit | js.Function0[Unit] | Subscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
        
        inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      }
    }
    
    trait Observer[T] extends StObject {
      
      var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var error: js.UndefOr[js.Function1[/* errorValue */ js.Any, Unit]] = js.undefined
      
      var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
      
      var start: js.UndefOr[js.Function1[/* subscription */ Subscription, js.Any]] = js.undefined
    }
    object Observer {
      
      inline def apply[T](): Observer[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Observer[T]]
      }
      
      extension [Self <: Observer[?], T](x: Self & Observer[T]) {
        
        inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
        
        inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
        
        inline def setError(value: /* errorValue */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
        
        inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        inline def setNext(value: /* value */ T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
        
        inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
        
        inline def setStart(value: /* subscription */ Subscription => js.Any): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
    
    type Subscriber[T] = js.Function1[/* observer */ SubscriptionObserver[T], Unit | js.Function0[Unit] | Subscription]
    
    trait Subscription extends StObject {
      
      var closed: Boolean
      
      def unsubscribe(): Unit
    }
    object Subscription {
      
      inline def apply(closed: Boolean, unsubscribe: () => Unit): Subscription = {
        val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
        __obj.asInstanceOf[Subscription]
      }
      
      extension [Self <: Subscription](x: Self) {
        
        inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
        
        inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
      }
    }
    
    trait SubscriptionObserver[T] extends StObject {
      
      var closed: Boolean
      
      def complete(): Unit
      
      def error(errorValue: js.Any): Unit
      
      def next(value: T): Unit
    }
    object SubscriptionObserver {
      
      inline def apply[T](closed: Boolean, complete: () => Unit, error: js.Any => Unit, next: T => Unit): SubscriptionObserver[T] = {
        val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
        __obj.asInstanceOf[SubscriptionObserver[T]]
      }
      
      extension [Self <: SubscriptionObserver[?], T](x: Self & SubscriptionObserver[T]) {
        
        inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
        
        inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
        
        inline def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
        
        inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      }
    }
  }
}
