package enumdatatype;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 1/27/22 - 9:04 AM
 */

/*
 * Even though an enum cannot use or be the target of an extends clause, it is possible
 * -- in specific and limited situations -- to have an enum that is a subclass of another enum.
 */

interface Emoticonable {
    public String getIcon();
}

enum Mood implements Emoticonable {
    GOOD {
        public String getIcon() {
            return ";-)";
        }
    },
    BAD {
        public String getIcon() {
            return ";-(";
        }
    };

    @Override
    public String toString() {
        return getIcon();
    }
}

enum Emotion implements Emoticonable {
    LAUGHING {
        public String toString() {
            return getIcon();
        }
    },
    CRYING {
        public String getIcon() {
            return ";'-(";
        }
    };

    @Override
    public String getIcon() {
        return ";-|";
    }
}

public class QuizOne {
    public static void main(String[] args) {
        System.out.println("Good mood, laughing " + Mood.GOOD + " " + Emotion.LAUGHING);
        System.out.println("Good mood, crying " + Mood.GOOD + " " + Emotion.CRYING);
    }
}