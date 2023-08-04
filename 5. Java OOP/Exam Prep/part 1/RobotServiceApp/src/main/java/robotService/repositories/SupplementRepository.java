package robotService.repositories;

import robotService.entities.supplements.Supplement;

import java.util.ArrayList;
import java.util.Collection;

public class SupplementRepository implements Repository {

    private final Collection<Supplement> supplements;

    public SupplementRepository() {
        this.supplements = new ArrayList<>();
    }

    // TODO too easy...
    @Override
    public void addSupplement(Supplement supplement) {
        this.supplements.add(supplement);
    }

    @Override
    public boolean removeSupplement(Supplement supplement) {
        if (supplements.contains(supplement)) {
            supplements.remove(supplement);
            return true;
        }
            return false;

    }
    // TODO meh...
    @Override
    public Supplement findFirst(String type) {
        for (Supplement supplement : supplements) {
            String supplementType = supplement.getClass().getSimpleName();
            if (type.equals(supplementType)) {
                return supplement;
            }
        }
        return null;

//       return this.supplements.stream()
//                .filter(s -> type.equals(s.getClass().getSimpleName()))
//                .findFirst()
//                .orElse(null);
   }
}
