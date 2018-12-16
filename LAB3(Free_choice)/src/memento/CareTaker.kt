package memento

import User

class CareTaker {
    private val mementoCollection = HashMap<User, ArrayList<Memento>>()

    fun saveState(user: User, state: Memento) {
        if (!mementoCollection.containsKey(user)) {
            mementoCollection[user] = ArrayList()
        }
        mementoCollection[user]!!.add(state)
    }

    fun restore(user: User, index: Int): Memento {
        return mementoCollection[user]!![index]
    }
}