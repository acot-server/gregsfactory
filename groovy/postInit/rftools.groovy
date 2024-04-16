def to_remove = [
    item('rftools:spawner'),
]

for (int i = 2; i <= 10; i++) {
    to_remove.add(item('rftools:shape_card', i));
}

for (thing in to_remove) {
    crafting.removeByOutput(thing);
}
